import cv2
import matplotlib.pyplot as plt
import numpy as np

# Ask user for path
file_path = input("Enter the path to the noisy image: ")

# Load image
noisy_img = cv2.imread(file_path)
if noisy_img is None:
    raise ValueError("Image not found. Please check the path.")
noisy_rgb = cv2.cvtColor(noisy_img, cv2.COLOR_BGR2RGB)

# Step 1: Slight denoising (not too aggressive)
denoised = cv2.fastNlMeansDenoisingColored(noisy_img, None, h=10, hColor=10, templateWindowSize=7, searchWindowSize=21)

# Step 2: CLAHE contrast boost
lab = cv2.cvtColor(denoised, cv2.COLOR_BGR2LAB)
l, a, b = cv2.split(lab)
clahe = cv2.createCLAHE(clipLimit=2.0, tileGridSize=(8, 8))
l_clahe = clahe.apply(l)
lab_clahe = cv2.merge((l_clahe, a, b))
contrast_boosted = cv2.cvtColor(lab_clahe, cv2.COLOR_LAB2BGR)

# Step 3: Gentle sharpening
kernel = np.array([[0, -1, 0],
                   [-1, 5, -1],
                   [0, -1, 0]])
sharpened = cv2.filter2D(contrast_boosted, -1, kernel)

# Convert to RGB for plotting
enhanced_rgb = cv2.cvtColor(sharpened, cv2.COLOR_BGR2RGB)

# Show side-by-side
combined = np.hstack((noisy_rgb, enhanced_rgb))
plt.figure(figsize=(14, 6))
plt.imshow(combined)
plt.axis('off')
plt.title("Left: Noisy | Right: Denoised + Enhanced (Balanced)")
plt.show()

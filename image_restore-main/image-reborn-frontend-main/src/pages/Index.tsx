
import { useState } from 'react';
import ImageUploader from '@/components/ImageUploader';
import ImageComparison from '@/components/ImageComparison';
import { Button } from '@/components/ui/button';
import { Download } from 'lucide-react';

const Index = () => {
  const [originalImage, setOriginalImage] = useState<string | null>(null);
  const [restoredImage, setRestoredImage] = useState<string | null>(null);
  const [isLoading, setIsLoading] = useState(false);

  const handleImageSelect = (file: File) => {
    const imageUrl = URL.createObjectURL(file);
    setOriginalImage(imageUrl);
    setRestoredImage(null);
  };

  const handleRestore = async () => {
    if (!originalImage) return;
    
    setIsLoading(true);
    // For now, we'll just simulate the restoration process
    // In a real app, you would call your image restoration API here
    setTimeout(() => {
      setRestoredImage(originalImage);
      setIsLoading(false);
    }, 2000);
  };

  const handleDownload = () => {
    if (restoredImage) {
      const link = document.createElement('a');
      link.href = restoredImage;
      link.download = 'restored-image.jpg';
      document.body.appendChild(link);
      link.click();
      document.body.removeChild(link);
    }
  };

  return (
    <div 
      className="min-h-screen relative bg-cover bg-center py-12 overflow-hidden"
      style={{ 
        backgroundImage: `url('/lovable-uploads/d0c075aa-281a-44ed-bdc7-93ffeb043ff0.png')`,
        backgroundColor: '#1e293b' // Slate-800 as a fallback
      }}
    >
      <div className="absolute top-0 left-0 right-0 bottom-0 pointer-events-none">
        <div className="absolute -top-20 -left-20 w-[500px] h-[500px] bg-purple-200/20 rounded-full blur-3xl animate-pulse"></div>
        <div className="absolute -bottom-20 -right-20 w-[500px] h-[500px] bg-blue-200/20 rounded-full blur-3xl animate-pulse"></div>
      </div>

      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 relative z-10">
        <div className="text-center mb-12 space-y-4">
          <h1 className="text-5xl font-extrabold text-white mb-4">
            Image Restoration
          </h1>
          <p className="text-lg text-white/90 max-w-2xl mx-auto">
            Breathe new life into your cherished memories. Upload old or damaged photos and watch them transform.
          </p>
        </div>

        <div className="max-w-3xl mx-auto space-y-8 bg-white/20 backdrop-blur-lg border border-white/30 rounded-3xl shadow-2xl p-8 relative overflow-hidden">
          <div className="absolute -z-10 inset-0 bg-black/30 blur-2xl"></div>
          
          {!originalImage ? (
            <ImageUploader onImageSelect={handleImageSelect} />
          ) : (
            <>
              <ImageComparison
                originalImage={originalImage}
                restoredImage={restoredImage || undefined}
                isLoading={isLoading}
              />
              
              <div className="flex justify-center gap-4 mt-6">
                <Button
                  onClick={handleRestore}
                  disabled={isLoading}
                  className="bg-white/20 text-white hover:bg-white/30 transition-all duration-300"
                >
                  {isLoading ? 'Restoring...' : 'Restore Image'}
                </Button>
                
                {restoredImage && (
                  <Button
                    onClick={handleDownload}
                    variant="outline"
                    className="border-white/30 text-white hover:bg-white/10"
                  >
                    <Download className="w-4 h-4" />
                    Download
                  </Button>
                )}
              </div>
              
              <Button
                onClick={() => {
                  setOriginalImage(null);
                  setRestoredImage(null);
                }}
                variant="ghost"
                className="w-full text-white/70 hover:text-white transition-colors"
              >
                Upload Different Image
              </Button>
            </>
          )}
        </div>
      </div>
    </div>
  );
};

export default Index;

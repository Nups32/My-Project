
import { useState, useCallback } from 'react';
import { useDropzone } from 'react-dropzone';
import { Upload, Image as ImageIcon } from 'lucide-react';
import { cn } from '@/lib/utils';

interface ImageUploaderProps {
  onImageSelect: (file: File) => void;
}

const ImageUploader = ({ onImageSelect }: ImageUploaderProps) => {
  const [isDragging, setIsDragging] = useState(false);

  const onDrop = useCallback((acceptedFiles: File[]) => {
    if (acceptedFiles?.length > 0) {
      onImageSelect(acceptedFiles[0]);
    }
  }, [onImageSelect]);

  const { getRootProps, getInputProps } = useDropzone({
    onDrop,
    accept: {
      'image/*': ['.jpeg', '.jpg', '.png', '.webp']
    },
    multiple: false
  });

  return (
    <div
      {...getRootProps()}
      className={cn(
        'relative cursor-pointer w-full h-64 rounded-lg border-2 border-dashed',
        'transition-all duration-200 ease-in-out',
        'flex flex-col items-center justify-center gap-4',
        isDragging ? 'border-purple-500 bg-purple-50' : 'border-gray-300 hover:border-purple-400',
      )}
      onDragEnter={() => setIsDragging(true)}
      onDragLeave={() => setIsDragging(false)}
    >
      <input {...getInputProps()} />
      <Upload className="w-12 h-12 text-gray-400" />
      <div className="text-center">
        <p className="text-lg font-medium text-gray-700">Drop your image here</p>
        <p className="text-sm text-gray-500">or click to select</p>
      </div>
      <div className="text-xs text-gray-400 mt-2">
        Supports: JPG, PNG, WEBP
      </div>
    </div>
  );
};

export default ImageUploader;

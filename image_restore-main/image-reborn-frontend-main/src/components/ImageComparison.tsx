
import { useState, useEffect } from 'react';
import { cn } from '@/lib/utils';
import { Skeleton } from '@/components/ui/skeleton';

interface ImageComparisonProps {
  originalImage: string;
  restoredImage?: string;
  isLoading?: boolean;
}

const ImageComparison = ({ originalImage, restoredImage, isLoading = false }: ImageComparisonProps) => {
  const [loaded, setLoaded] = useState(false);

  useEffect(() => {
    setLoaded(false);
  }, [originalImage, restoredImage]);

  return (
    <div className="grid grid-cols-1 md:grid-cols-2 gap-6 w-full">
      <div className="relative aspect-square w-full">
        <div className="absolute inset-0 rounded-lg overflow-hidden">
          {!loaded && <Skeleton className="w-full h-full" />}
          <img
            src={originalImage}
            alt="Original"
            onLoad={() => setLoaded(true)}
            className={cn(
              "w-full h-full object-cover transition-opacity duration-300",
              loaded ? "opacity-100" : "opacity-0"
            )}
          />
        </div>
        <div className="absolute bottom-4 left-4 bg-black/60 text-white px-3 py-1 rounded-full text-sm">
          Original
        </div>
      </div>

      <div className="relative aspect-square w-full">
        <div className="absolute inset-0 rounded-lg overflow-hidden">
          {isLoading ? (
            <div className="w-full h-full flex items-center justify-center bg-gray-100 rounded-lg">
              <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-purple-500" />
            </div>
          ) : restoredImage ? (
            <>
              {!loaded && <Skeleton className="w-full h-full" />}
              <img
                src={restoredImage}
                alt="Restored"
                onLoad={() => setLoaded(true)}
                className={cn(
                  "w-full h-full object-cover transition-opacity duration-300",
                  loaded ? "opacity-100" : "opacity-0"
                )}
              />
            </>
          ) : (
            <div className="w-full h-full flex items-center justify-center bg-gray-100 rounded-lg">
              <p className="text-gray-500 text-sm">Restored image will appear here</p>
            </div>
          )}
        </div>
        <div className="absolute bottom-4 left-4 bg-black/60 text-white px-3 py-1 rounded-full text-sm">
          Restored
        </div>
      </div>
    </div>
  );
};

export default ImageComparison;

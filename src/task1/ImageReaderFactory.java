package task1;

import task1.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        BmpReader bmpReader = new BmpReader();
        JpgReader jpgReader = new JpgReader();
        PngReader pngReader = new PngReader();

        switch (imageTypes.name()) {
            case ("BMP"):
                return bmpReader;
            case ("JPG"):
                return jpgReader;

            case ("PNG"):
                return pngReader;
            default:
                throw new IllegalArgumentException();

        }
    }
}

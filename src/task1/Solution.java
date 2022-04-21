package task1;

import task1.common.ImageReader;
import task1.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.ty);
        System.out.println(reader);
    }
}

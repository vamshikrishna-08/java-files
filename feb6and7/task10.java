public class task10 {   // Data Sync Validation
    public static void main(String[] args) {
        int[] sourceData = {10, 20, 30, 40, 50};
        int[] destinationData = {10, 25, 30, 45, 50};
         boolean isIdentical = true;
        if (sourceData.length != destinationData.length) {
            System.out.println("Arrays are not identical (different lengths).");
            return;
        }
        System.out.println("Mismatched Indexes:");
        for (int i = 0; i < sourceData.length; i++) {
            if (sourceData[i] != destinationData[i]) {
                System.out.println(
                    "Index " + i +
                    " -> Source: " + sourceData[i] +
                    ", Destination: " + destinationData[i]
                );
                isIdentical = false;
            }
        }
        if (isIdentical) {
            System.out.println("Both arrays are identical.");
        } else {
            System.out.println("Data sync validation failed.");
        }
    }
}
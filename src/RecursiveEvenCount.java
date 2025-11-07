public class RecursiveEvenCount {
        public static int countEven(int[] arr, int index) {

            if (index == arr.length) {
                return 0;
            }

            int count = (arr[index] % 2 == 0) ? 1 : 0;

            return count + countEven(arr, index + 1);
        }
        public static void main(String[] args) {
            int[] numbers = {3, 6, 4, 7, 8};
            int result = countEven(numbers, 0);

            System.out.println("Number of even elements: " + result);
        }
    }




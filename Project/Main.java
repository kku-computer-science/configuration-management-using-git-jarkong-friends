package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับข้อมูลชุดตัวเลข
        System.out.println("Please enter number to sort(separate by blank) : ");
        String input = scanner.nextLine();
        
        // แปลง String เป็น array int
        String[] tokens = input.trim().split("\\s+");
        int[] numbers = new int[tokens.length];
        
        try {
            for (int i = 0; i < tokens.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please fill only number");
            scanner.close();
            return;
        }
        
        // แสดงข้อมูลก่อน sort
        System.out.println("\nBefore sort:");
        printArray(numbers);
        
        // เลือกวิธีการ sort
        System.out.println("\nChoose sort algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Please type 1 or 2 : ");
        
        int choice = scanner.nextInt();
          
        // ทำการ sort ตามที่เลือก
        switch (choice) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.bubblesort(numbers);
                System.out.println("\nUse Bubble Sort");
                break;
            case 2:
                QuickSort quickSort = new QuickSort();
                quickSort.Quicksort(numbers, 0, numbers.length - 1);
                System.out.println("\nUse Quick Sort");
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }
        
        // แสดงผลลัพธ์หลัง sort
        System.out.println("\nAfter sort:");
        printArray(numbers);
            
        scanner.close();
    }
    
    // ฟังก์ชันสำหรับแสดงผล array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

//package edu.miracosta.cs112.stylesparkfx;
//
//import java.util.Scanner;
//
//public class ColorPaletteQuiz {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] palettes = {
//                "Cool Winter: \nBest colors: Bright and cool shades like royal blue, emerald green, and pure white\nWorst colors:  Warm and muted colors like earthy tones and pastels",
//                "Clear Winter: \nBest Colors: Vibrant and clear colors such as bright red, cobalt blue, and pure white\nWorst colors: Dull or muted colors, as they can appear washed out",
//                "Deep Winter: \nBest Colors: Rich and deep shades like deep burgundy, navy, and charcoal gray\nWorst Colors: Pale or pastel colors, which may make the complexion appear dull",
//                "Light Summer: \nBest Colors: Soft and cool pastels like soft pink, lavender, and icy blue\nWorst Colors:  Bright or intense colors, which can overpower the softness of the palette",
//                "Soft Summer: \nBest Colors: Muted and cool tones such as soft gray, dusty rose, and periwinkle\nWorst Colors:  Harsh and overly vibrant colors, which can be too contrasting",
//                "Cool Summer: \nBest Colors: Cool and muted shades like soft mint green, lavender, and soft gray.\nWorst Colors: Warm and intense colors, which can clash with the cool undertones",
//                "Light Spring: \nBest Colors: Soft and warm pastels like peach, coral, and soft yellow\nWorst Colors: Dark or overly intense colors, which may overwhelm the palette",
//                "Clear Spring: \nBest Colors: Bright and clear shades such as bright red, clear turquoise, and true green\nWorst Colors: Muted or dull colors, as they can appear flat on this palette",
//                "Warm Spring: \nBest Colors: Warm and sunny hues like warm coral, golden yellow, and warm green\nWorst Colors: Cool or pastel colors, which can make the palette look washed out",
//                "Warm Autumn: \nBest Colors: Rich and warm earth tones like deep rust, olive green, and warm brown\nWorst Colors: Cool or bright shades, which can clash with the warm undertones",
//                "Deep Autumn: \nBest Colors: Deep and rich colors such as deep orange, dark teal, and chocolate brown\nWorst Colors: Pale or pastel shades, which can make the palette appear dull",
//                "Soft Autumn: \nBest Colors: Soft and warm muted tones like soft peach, camel, and warm olive\nWorst Colors: Bright or intense colors, which can overpower the softness of the palette"
//        };
//
//        int[] counts = new int[palettes.length];
//        //0 cool winter
//        //1 clear winter
//        //2 deep winter
//        //3 light summer
//        //4 soft summer
//        //5 cool summer
//        //6 light spring
//        //7 clear spring
//        //8 warm spring
//        //9 warm autumn
//        //10 deep autumn
//        //11 soft autumn
//
//
//
//
//        System.out.println("\nWelcome to the Color Palette Quiz!\nAnswer the following questions to determine your best-suited color palette.");
//
//        System.out.println("\n1. What is your natural hair color?");
//        System.out.println("   a) Ashy blond or brown, black brown or black with blue undertones");
//        System.out.println("   b) Light to medium ash blond, light ash brown, medium brown to black (cool undertone) ");
//        System.out.println("   c) Light to medium gold blonde and brown to dark brown, warm auburn, darker red");
//        System.out.println("   d) Strawberry blond, golden blond, coppery red, light golden brown");
//        System.out.print("Your choice: ");
//        String choice = scanner.nextLine().toLowerCase();
//        switch (choice) {
//            case "a" -> {
//                counts[0]++;
//                counts[1]++;
//                counts[3]++;
//                counts[4]++;
//                counts[5]++;
//                //coolWinterCount++;
//                //clearWinterCount++;
//                //lightSummerCount++;
//                //softSummerCount++;
//                //coolSummerCount++;
//
//            }
//            case "b" -> {
//                counts[1]++;
//                counts[2]++;
//                counts[3]++;
//                counts[4]++;
//                counts[5]++;
//
//                //clearWinterCount++;
//                //deepWinterCount++;
//                //lightSummerCount++;
//                //softSummerCount++;
//                //coolSummerCount++;
//
//            }
//            case "c" -> {
//                counts[6]++;
//                counts[11]++;
//                counts[9]++;
//                counts[10]++;
//                //lightSpringCount++;
//                //softAutumnCount++;
//                //warmAutumnCount++;
//                //deepAutumnCount++;
//            }
//            case "d" -> {
//                counts[6]++;
//                counts[7]++;
//                counts[8]++;
//                //lightSpringCount++;
//                //clearSpringCount++;
//                //warmSpringCount++;
//            }
//            default -> {
//                System.out.println("Invalid choice. Please choose a valid option.");
//            }
//        }
//
//        System.out.println("\n2. What color are your eyes?");
//        System.out.println("   a) Blue, gray, light brown, icy hazel");
//        System.out.println("   b) Bright blue, clear hazel, green, and brown");
//        System.out.println("   c) Dark hazel, light brown, dark brown, black");
//        System.out.println("   d) Light gray, light blue, medium blue");
//        System.out.print("Your choice: ");
//        choice = scanner.nextLine().toLowerCase();
//        switch (choice) {
//            case "a" -> {
//                counts[0]++;
//                counts[4]++;
//                //coolWinterCount++;
//                //softSummerCount++;
//            }
//            case "b" -> {
//                counts[1]++;
//                counts[4]++;
//                counts[7]++;
//                counts[8]++;
//                counts[9]++;
//                counts[11]++;
//                //clearWinterCount++;
//                //softSummerCount++;
//                //clearSpringCount++;
//                //warmSpringCount++;
//                //warmAutumnCount++;
//                //softAutumnCount++;
//            }
//            case "c" -> {
//                counts[2]++;
//                counts[10]++;
////                deepWinterCount++;
////                deepAutumnCount++;
//            }
//            case "d" -> {
//                counts[3]++;
//                counts[5]++;
//                counts[6]++;
//                //lightSummerCount++;
//                //coolSummerCount++;
//                //lightSpringCount++;
//            }
//            default -> {
//                System.out.println("Invalid choice. Please choose a valid option.");
//            }
//        }
//
//        //0 cool winter
//        //1 clear winter
//        //2 deep winter
//        //3 light summer
//        //4 soft summer
//        //5 cool summer
//        //6 light spring
//        //7 clear spring
//        //8 warm spring
//        //9 warm autumn
//        //10 deep autumn
//        //11 soft autumn
//
//        System.out.println("\n3. How would you describe your skin tone?");
//        System.out.println("   a) Cool undertones that generally range from medium beige to dark cool brown");
//        System.out.println("   b) Neutral undertone with possible rosy tint");
//        System.out.println("   c) Skin with pink or peachy undertones");
//        System.out.println("   d) Skin with warm, golden undertones");
//        System.out.print("Your choice: ");
//        choice = scanner.nextLine().toLowerCase();
//        switch (choice) {
//            case "a" -> {
//                counts[0]++;
//                counts[1]++;
//                counts[2]++;
//                counts[5]++;
//                counts[7]++;
////                coolWinterCount++;
////                clearWinterCount++;
//                //deepWinter++;
//                //coolSummerCount++;
//                //clearSpringCount++;
//            }
//            case "b" -> {
//                counts[0]++;
//                counts[3]++;
//                counts[4]++;
//                counts[11]++;
////                coolWinterCount++;
////                lightSummerCount++;
////                softSummerCount++;
//                //softAutumnCount++;
//            }
//            case "c" -> {
//                counts[6]++;
//                //lightSpringCount++;
//            }
//            case "d" -> {
//                counts[2]++;
//                counts[7]++;
//                counts[8]++;
//                counts[9]++;
//                counts[10]++;
//                counts[11]++;
//                //deepWinter++;
//                //clearSpringCount++;
//                //warmSpringCount++;
//                //warmAutumnCount++;
//                //deepAutumnCount++;
//                //softAutumnCount++;
//            }
//            default -> {
//                System.out.println("Invalid choice. Please choose a valid option.");
//            }
//        }
//
//        //0 cool winter
//        //1 clear winter
//        //2 deep winter
//        //3 light summer
//        //4 soft summer
//        //5 cool summer
//        //6 light spring
//        //7 clear spring
//        //8 warm spring
//        //9 warm autumn
//        //10 deep autumn
//        //11 soft autumn
//
//
//        System.out.println("\n4. Which metal tone do you look best with?");
//        System.out.println("   a) Silver");
//        System.out.println("   b) Gold");
//        System.out.print("Your choice: ");
//        choice = scanner.nextLine().toLowerCase();
//        switch (choice) {
//            case "a" -> {
//                counts[0]++;
//                counts[1]++;
//                counts[2]++;
//                counts[3]++;
//                counts[4]++;
//                counts[5]++;
//                //coolWinterCount++;
//                //clearWinterCount++;
//                //deepWinterCount++;
//                //lightSummerCount++;
//                //softSummerCount++;
//                //coolSummerCount++;
//            }
//            case "b" -> {
//                counts[6]++;
//                counts[7]++;
//                counts[8]++;
//                counts[9]++;
//                counts[10]++;
//                counts[11]++;
//                //lightSpringCount++;
//                //clearSpringCount++;
//                //warmSpringCount++;
//                //warmAutumnCount++;
//                //deepAutumnCount++;
//                //softAutumnCount++;
//            }
//            default -> {
//                System.out.println("Invalid choice. Please choose a valid option.");
//            }
//        }
////0 cool winter
//        //1 clear winter
//        //2 deep winter
//        //3 light summer
//        //4 soft summer
//        //5 cool summer
//        //6 light spring
//        //7 clear spring
//        //8 warm spring
//        //9 warm autumn
//        //10 deep autumn
//        //11 soft autumn
//
//
//        int maxCount = counts[0];
//        for (int i = 1; i < counts.length; i++) {
//            if (counts[i] > maxCount) {
//                maxCount = counts[i];
//            }
//        }
//
//        System.out.println("\nYour best-suited color palettes are:");
//
//        for (int i = 0; i < counts.length; i++) {
//            if (counts[i] == maxCount) {
//                System.out.println(palettes[i]);
//            }
//        }
//    }
//}
//

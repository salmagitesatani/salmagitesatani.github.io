package edu.miracosta.cs112.stylesparkfx;

public class SSprofile {

    private int age;
    private String gender;
    private String userName;
    private static String[] colorPalette = {"Light Summer", "Soft Summer", "Cool Summer", "Light Spring", "Clear Spring", "Warm Spring", "Soft Autumn", "Warm Autumn", "Deep Autumn", "Cool Winter", "Clear Winter", "Deep Winter"};
    private static String[] genderOptions = {"Male", "Female", "Other"};


    public SSprofile(int age, String gender, String userName) {
        this.age = age;
        this.gender = gender;
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String[] getGenderOptions() {
        return genderOptions;
    }


    public static class Style {
        private String name;
        private String description;
        private String colorPalette;
        private String commonItems;

        public Style(String name, String description, String colorPalette, String commonItems) {
            this.name = name;
            this.description = description;
            this.colorPalette = colorPalette;
            this.commonItems = commonItems;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getColorPalette() {
            return colorPalette;
        }

        public String getCommonItems() {
            return commonItems;
        }


        public static Style[] styles()
        {
            Style[] styles = new Style[16];

            styles[0] = new Style("Boho: ", "A style that is distinctive and free-spirited fashion trend that draws inspiration from bohemian and hippie influences.", "Color Palette: Earthy Tones, Jewel Tones, Muted Pastels, Mixed Print. ", "Common Items: Flowy Dresses, Bell Sleeves, Fringe, Embroidery, Layered Accessories, Ankle Boots.");
            styles[1] = new Style("Goth: ", "A style known for its dark and edgy aesthetic, all-black attire and a fascination with elements of the dark and mysterious.", "Color Palette: Black, Deep, Rich colors, Contrasting Accents (White and Silver). ", "Common Items: Leather, Fishnet Stockings, Spikes and Studs, Platform Boots, Victorian and Romantic Elements.");
            styles[2] = new Style("Chic: ", "A style that emphasizes refined elegance, classic simplicity, and a certain 'effortlessly put-together' quality", "Color Palette: Neutral Tones and Monochromatic. ", "Common Items: Tailored Clothing, Pencil Skirt, Trench Coat, High Quality Fabric, Heels, Classic Accessories.");
            styles[3] = new Style("Indie: ", "A style that is a rejection of mainstream fashion norms in favor of a unique and independent aesthetic, that celebrates individualism and self-expression. ", "Color Palette: Vibrant mix of colors, Vintage, Faded Tones. ", "Common Items: Vintage, Thrifted Pieces, Layered Outfits, Quirky Accessories, Denim.");
            styles[4]= new Style("Coquette: ", "A style that is a playful and flirtatious fashion approach that celebrates femininity and allure.", "Color Palette: Feminine Colors, Pastel Colors, Light, Soft Colors. ", "Common Items: Dresses, High Heels, Flirty Blouses (Ruffles, Lace, Bows), Skirts, Floral Patterns, Vintage Clothes");
            styles[5] = new Style("Acubi: ", "A style that originated from China. The fashion combined the aesthetics of Cyber Fairy Grunge, Minimalism and Subversive Basics.", "Color Palette: Monochrome, Muted colors, Neutral colors. ", "Common Items: Baggy Pieces, Baby Tees, Mesh and Sheer clothes, Layering pieces, Skirts, Cargo Pants, Platform Boots.");
            styles[6] = new Style("Streetwear: ", "A style that has its origins in urban culture and is known for its casual, comfortable, and often edgy look. ", "Color Palette: Neutral Tones, Bold Accents, Graphic Prints. ", "Common Items: Graphic T-Shirts, Baggy Pants, Cargo Pants, Sneakers, Distressed Denim.");
            styles[7] = new Style("Y2k: ", "A distinctive style that reflects the fashion trends and aesthetics of the early 2000s, which was influenced by pop culture, technology, and futuristic ideas.", "Color Palette: Pastels, Neutrals, Metallic. ", "Common Items: Low Rise Pants and Skirts, Crop Tops, Mini Skirts, Platform Shoes, Logos, Sheer Fabrics, Tracksuits, Sunglasses.");
            styles[8] = new Style("Preppy: ", "A style that is a classic and timeless fashion and is characterized by a clean, polished, and traditionally well-groomed appearance.", "Color Palette: Classic Colors (Red, White, Navy, Green). ", "Common Items: Polo Shirts, Button-Down Shirts, Cable-Knit Sweaters, Blazers, Pearls, Tote Bags.");
            styles[9] = new Style("Vintage: ", "A style that celebrates clothing and accessories from previous eras. It involves wearing authentic vintage pieces. Vintage style is known for its timeless and nostalgic appeal.", "Color Palette: Dependent on Era. ", "Common Items: Retro Dresses, High-Waisted Bottoms, Retro Footwear, Thrifted Pieces");
            styles[10] = new Style("Business Casual: ", "strikes a balance between formal business attire and casual wear. Business casual attire is characterized by its polished yet less formal appearance. ", "Color Palette: Classic Colors, Neutral Colors. ", "Common Items: Collared Shirts, Blazers, Pencil Skirts, Slacks, Cardigans, Accessories. ");
            styles[11] = new Style("Minimalist: ", "A style that is clean, simple, and uncluttered approach to dressing. It emphasizes simplicity, functionality, and a reduction of excess", "Color Palette: Neutral Colors, Muted Colors. ", "Common Items: Simple, Clean Line Clothing, No Pattern clothes, Monochromatic, Subtle Accessories. ");
            styles[12] = new Style("Formal: ", "A style that utlilizes the most elegant, refined, and polished style of clothing", "Color Palette: Classic and Neutral Colors, Bold Color Accents. ", "Common Items: Suits (Men), Tuxedos (Men), Dress Shirts (Men), Long Dresses (Women), Heels, Dress Shoes, Clutches, Jewelry. ");
            styles[13] = new Style("Old Money: ", "A style that is a classic and timeless approach to fashion and lifestyle often associated with established and wealthy families who have inherited their wealth and social status over generations.", "Color Palette: Neutral and Muted Colors. ", "Common Items: Collared Shirts, Conservative Dresses, Pearls, Equestrian style, Trench Coat, Herringbone Patterns.");
            styles[14] = new Style("Camp: ", "A style that is flamboyant and exaggerated approach to dressing that celebrates extravagance, irony, humor, and theatricality. It often involves embracing the absurd and the over-the-top, with a sense of playfulness and self-expression. ", "Color Palette: Bright and Bold Colors. ", "Common Items: Sequins and Glitter, Animal Print, Unconventional Accessories, Thrifted Pieces, Heels.");
            styles[15] = new Style("Modest: ", "A style that emphasizes a reserved and understated appearance, often covering the body more conservatively.", "Color Palette: Any Color. ", "Common Items: Long Hemlines, High Necklines, Long Sleeves, Loose-Fit, Layering. ");


            return styles;
        }
    }
}

//public class SSProfile:
//color pallette
//age
//gender
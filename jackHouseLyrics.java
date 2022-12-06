public class jackHouseLyrics{
    // write a program that produces as output the words of "the house that jack built

    public static void main(String[] args){
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
        verse7();
    }
    public static void verse1(){
        System.out.println("This is the house that Jack built.");
        System.out.println();
    }
    public static void last2(){
        System.out.println("That ate the malt \nThat lay in the house that Jack built.");
        System.out.println();
    }
    public static void verse2(){
        System.out.println("This is the malt \nThat lay in the house that Jack built.");
        System.out.println();
    }
    public static void verse3(){
        System.out.println("This is the rat, ");
        last2();
    }
    public static void verse4(){
        System.out.println("This is the cat, \nThat killed the rat, ");
        last2();
    }
    public static void verse5(){
        System.out.println("This is the dog, \nThat worried the cat, \nThat killed the rat, ");
        last2();
    }
    public static void verse6(){
        System.out.println("This is the cow with the crumpled horn, \nThat tossed the dog, \nThat worried the cat, \nThat killed the rat, ");
        last2();
    }
    public static void verse7(){
        System.out.println("This is the maiden all forlorn \nThat milked the cow with the crumpled horn, \nThat tossed the dog, \nThat worried the cat, \nThat killed the rat, ");
        last2();
    }


}
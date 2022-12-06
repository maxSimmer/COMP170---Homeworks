public class drawTop {
    // top feature
    public static void top(int size) {
        for(int i=1;i<size;i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }

    // middle feature
    public static void middle(int size, int index) {
        for(int i=1;i<size-index;i++) {
            System.out.print(" ");
        }
        for(int i=0;i<index;i++)System.out.print("*");
        System.out.print("||");
        for(int i=0;i<index;i++)System.out.print("*");
        System.out.println();
    }
    //bottom feature
    public static void bottom(int size) {
        for(int i=0;i<2*size;i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    // declare a constant variable for the size which will loop each feature to the desired sizes
    public static final int size = 2;
    public static void main(String[] args) {
        for(int i=0;i<size;i++)top(size);
        for(int i=0;i<size;i++)middle(size,i);
        bottom(size);
        for(int i=size-1;i>=0;i--)middle(size,i);
        for(int i=0;i<2*size;i++)top(size);
        for(int i=0;i<size;i++)bottom(size);
    
    }
 }
 


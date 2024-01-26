package basics;

public class Increment {

    // ▬ FIRS RUN METHOD ▬
    public static void main(String[] args) {

        int x = 0;
        int a = 0;
        int y = 7;




        // ▼ "POST INCREMENTATION"
        //          •► "Old x = New x + 1"
        //      → "1" IS "ADDED" TO "MEMORY"
        //      → "AFTER EXECUTION" OF THE "LINE" ▼
//        x = x + 1;
//        x += 1;
        x++;

        System.out.println("Post Increment: " + x);



        // ▼ "PRE INCREMENTATION"
        //      → "1" IS "ADDED" TO "MEMORY"
        //      → "BEFORE EXECUTION" OF THE "LINE" ▼
        ++a;

        System.out.println("Pre Increment: " + a);



        // ▼ "POST DECREMENT"
        //      •► "Old y = New y - 1" ▼
//        y = y -1;
//        y -= 1;
        y--;

        System.out.println("Post Decrement: " + y);

    }
}

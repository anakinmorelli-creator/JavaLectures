class constructor {
    int x;
    int y;

    // The Constructor
    constructor(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public static void main(String[] args) {
        // Calling the constructor using the 'new' keyword
        constructor p1 = new constructor(10, 20);
        constructor p2 = new constructor(12, 17);

        System.out.println("x=" + p1.x + ", y=" + p1.y);

        System.out.println(p2);
    }

}



public class Main {
    public static void main(String[] args) {
        String [] phrase1 =  {"You", "I"};
        String [] phrase2 = {"are", "is", "was"};
        String [] phrase3 = {"sick" ,"tall", "short"};
        int p1 = phrase1.length;
        int p2 = phrase2.length;
        int p3 = phrase3.length;
        int r1 = (int) (Math.random() * p1);
        int r2 = (int) (Math.random() * p2);
        int r3 = (int) (Math.random() * p3);
        System.out.println("Phrase: "+phrase1[r1] +" " +phrase2[r2]+" "+phrase3[r1]+".");


    }
}
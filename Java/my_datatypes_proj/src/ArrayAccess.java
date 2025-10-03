public class ArrayAccess {
    public static void main(Stringp[] args){

        int years[] = {2020,2021,2022,2023,2024,2025};
        System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2]);
        System.out.println(years[3]);
        System.out.println(years[4]);
        System.out.println(years[5]);

        int years2[] = new int[6];
        years2[1] = 2021;
        years2[3] = 2023;
        System.out.println(years2[0]);
        System.out.println(years2[1]);
        System.out.println(years2[2]);
        System.out.println(years2[3]);
        System.out.println(years2[4]);
        System.out.println(years2[5]);
    }
}
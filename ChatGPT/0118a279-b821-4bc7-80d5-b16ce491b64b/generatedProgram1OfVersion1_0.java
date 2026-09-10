    public static void main(String[] args) {
        int number = 123456;
        
        breakInteger(number);
    }
    
    public static void breakInteger(int number) {
        if(number < 10) {
            System.out.print(number + " ");
        } else {
            breakInteger(number / 10);
            System.out.print(number % 10 + " ");
        }
    }
}
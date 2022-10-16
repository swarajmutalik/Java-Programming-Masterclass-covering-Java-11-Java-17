public class NumberPalindrome {
    public static boolean isPalindrome(int number){
    int temp = number;
    int reverse=0,lastDigit;
    while(temp!=0){
        lastDigit = temp%10;
        reverse = reverse*10 + lastDigit;
        temp = temp/10;
    }

    if(number==reverse){
        return true;
    }
    else{
        return false;
 }
    }
}

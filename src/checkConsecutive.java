public class checkConsecutive {

    public boolean checkConsecutiveNo(String numberString){
        if(numberString==null)
            return false;
        if(numberString==" " || numberString=="")
            return false;
        String[] number_string = numberString.split(",");
        int[] number= new int[number_string.length];
        for(int i=0;i<number_string.length;i++){
            number[i]=Integer.parseInt(number_string[i]);
        }
        int flag=0;
        if(number[0]<number[1]) {
            for (int i = 1; i < number_string.length; i++) {
                if (number[i - 1] != (number[i] - 1)) {
                    flag = 1;
                    break;
                }
            }
        }
        else{
            for (int i = 1; i < number_string.length; i++) {
                if (number[i - 1] != (number[i] + 1)) {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0) return true;
        return false;
    }
}

class calculation{
	public static void main(String[] args){}
	public int calculate(String s) {
        //1. "1 + 1"
        //2. " 2-1 + 2 "
        //3. "(1+(4+5+2)-3)+(6+8)"
        //4. " 30"
        //5. "1 - 11"
        //6. "273519461357"
        /*
        * 去掉所有空格
        * 判断字符串中是否有非数字符号，没有，就直接字符串转Int,返回
        * 遇到( , ) 就忽略
        * 判断两个非数字符号之间的数字为几位数, 然后计算数字的值
        * 
        * 
         */
    }
}

/*

class Solution {
    public int calculate(String str) {
        String subStr = null;
        String s = str.trim();
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < s.length();){
            subStr = s.substring(i, i + 1);
            if(subStr.equals("(") || subStr.equals(")") || subStr.equals(" ")){
                i += 1;
            }else if(st.empty()){
                st.push(Integer.parseInt(subStr));
                System.out.println("empty push: " + Integer.parseInt(subStr));
                i += 1;
            }else if(subStr.equals("+")){
                while(s.substring(i + 1, i + 2).equals(" ") ||
                     s.substring(i + 1, i + 2).equals("(") ||
                     s.substring(i + 1, i + 2).equals(")")){
                    i += 1;
                }
                if(Integer.parseInt(s.substring(i + 2, i + 3)) <=9 &&
                     Integer.parseInt(s.substring(i + 2, i + 3)) >= 0){
                    int maxi =  Integer.parseInt(s.substring(i + 2, i + 3)) + 
                                       10 * Integer.parseInt(s.substring(i + 1, i + 2));
                    st.push(maxi);
                    i += 1;
                }else{
                    st.push(Integer.parseInt(s.substring(i + 1, i + 2)));
                }
                i += 2;
                System.out.println("maxi i: " + i);
            }else if(subStr.equals("-")){
                while(s.substring(i + 1, i + 2).equals(" ") ||
                     s.substring(i + 1, i + 2).equals("(") ||
                     s.substring(i + 1, i + 2).equals(")")){
                    i += 1;
                }
                if(Integer.parseInt(s.substring(i + 2, i + 3)) <=9 &&
                     Integer.parseInt(s.substring(i + 2, i + 3)) >= 0){
                    int minus = (-1) * ((Integer.parseInt(s.substring(i + 2, i + 3))) + 
                                       10 * Integer.parseInt(s.substring(i + 1, i + 2)));
                    System.out.println("minus push: " + minus);
                    st.push(minus);
                    i += 1;
                }else {
                    int minus = (-1) * (Integer.parseInt(s.substring(i + 1, i + 2)));
                }
                i += 2;
                System.out.println("minus i: " + i);
            }else {
                System.out.println("st peek: " + st.peek());
                System.out.println("else i: " + i);
                return Integer.parseInt(s);
            }
        }
        int initSize = st.size();
            int sum = 0;
            for(int j = 0; j < initSize; j++){
                sum += st.pop();
        }
        return sum;
    }
}
 */
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){

            }
            else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + 32);
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        System.out.println(String.valueOf(ch));
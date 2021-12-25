package leetcode;

public class MaximumNumberOfWord {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i=0; i<sentences.length; i++) {
            int length = sentences[i].split(" ").length;
            if(length>count) {
                count = length;
            }
        }
        return count;

    }

    public static void main(String[] args) {
       String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
       MaximumNumberOfWord maximumNumberOfWord = new MaximumNumberOfWord();
       int result = maximumNumberOfWord.mostWordsFound(sentences);
        System.out.println(result);

    }
}

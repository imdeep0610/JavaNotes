package deep10;

public class StringPerformance {
    public static void main(String[] args) {
        String series="";//here series is empty

        for (int i=0;i<26;i++){
            char ch=(char)('a' + i);
            series=series+ch;
            /* 1st step : series=""+"a"=a
            series="a"+"b"=ab
            series="ab"+"c"=abc
            series="abc...y"+"z"=abcde...z
            here each time new object is creating everytime since string are immutable
            at last only last obj has ref var other all obj is derefenced,and even memory wastage
            Time Complexity=0(N2) very bad for string in adding
            so we need data type that will allow us to modify value , string doest allow (it create new
            one with keeping old one)
            series="abc"+"d"="abcd" but no new object created , only series gets modified
            This is achieved by  data type String Builder
            It will modify series and has one ref var and obj
             */
        }
        System.out.println(series);//print each character till z

        StringBuilder build=new StringBuilder();
        for (int i=0;i<26;i++){
            char ch=(char)('a' + i);
            build.append(ch);
        }
        System.out.println(build.toString());
        //output = abcde...z but here only one object is created and get modified each time
        build.deleteCharAt(0);
        System.out.println(build);//delete a
        build.reverse();
        System.out.println(build);//zyx....dcb
    }
}

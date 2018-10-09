package com.example.w0193215.assignment1;

public class CalcClass
{
    public String Calculations (float Leftnum, char operator, float Rightnum)
    {
        float Answer = 0.0f;

            switch(operator)
            {
                case '+':
                    Answer = Leftnum + Rightnum;
                    if(Leftnum == 0 && Rightnum == 0){
                        Answer = Float.NaN;
                    }
                    else{
                        break;
                    }
                case '-':
                    Answer = Leftnum - Rightnum;
                    if(Leftnum == 0 && Rightnum == 0){
                        Answer = Float.NaN;
                    }
                    else{
                        break;
                    }
                case '/':
                    Answer = Leftnum / Rightnum;
                    if(Leftnum == 0){
                        Answer = Float.NaN;
                    }
                    else if(Rightnum == 0){
                        Answer = Float.NaN;
                    }
                    else{
                        break;
                    }
                case 'x':
                    Answer = Leftnum * Rightnum;
                    if(Leftnum == 0){
                        Answer = Float.NaN;
                    }
                    else if(Rightnum == 0){
                        Answer = Float.NaN;
                    }
                    else{
                        break;
                    }
                default:

            }


        return String.valueOf(Answer);
    }

}

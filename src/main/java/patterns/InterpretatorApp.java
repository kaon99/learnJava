package patterns;

public class InterpretatorApp {
    public static void main(String[] args) {

        Context context = new Context();
        Expression expr = context.evalute("1+2+3");
        System.out.println(expr.interpred());

    }
}
    interface Expression {
        int interpred();
    }

    class NumberExpression implements Expression {
        int number;

        public NumberExpression(int number) {
            this.number = number;
        }

        @Override
        public int interpred() {
            return number;
        }
    }

    class MinusExpression implements Expression {
        Expression left;
        Expression right;

        public MinusExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int interpred() {
            return left.interpred() - right.interpred();
        }
    }

    class PlusExpression implements Expression {
        Expression left;
        Expression right;

        public PlusExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int interpred() {
            return left.interpred() + right.interpred();
        }
    }

     class Context {
        Expression evalute (String s ) {
int pos  = s.length()-1;
while (pos> 0){
    if (Character.isDigit(s.charAt(pos))){
        pos--;
    }
    else {
        Expression left = evalute(s.substring(0,pos));
        Expression right = new NumberExpression(Integer.valueOf(s.substring(pos+1, s.length())));
        char operator = s.charAt(pos);
        switch (operator){
            case  '-': return new MinusExpression(left,right);
            case  '+': return new PlusExpression(left,right);
        }
    }
}
int result = Integer.valueOf(s);
return new NumberExpression(result);


        }
     }


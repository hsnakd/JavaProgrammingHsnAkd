package ReplitSolutions_HsnAkd._7_Arraylist.Calc_II;

public class Calc {
    private String names;
    private int x;
    private int y;
    private int result;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int plus(){
        result = x+y;
        return result;
    }

    public int minus(){
        result = x-y;
        return result;
    }
}
/*
This assignment is another calculator class, but it will be encapsulated.

> Attributes

  - String: names
  - int: x, y, result

**Attributes should be encapsulated**


>Instance Methods:

   - getResult() - getter method for private `result`
   - setY(int y) - setter method for private `y`
   - setX(int x) - setter method for private `x`
   - void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result



Example:

```
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();

  System.out.println(a.getResult());
  prints: 5

  a.plus();
  System.out.println(a.getResult());
  prints: 15
```


 */
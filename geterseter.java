

package hpp;

class rectanglee {
    private int lenth;
    private int breadth;

    public rectanglee() {
        this.lenth = 5;
        this.breadth = 6;
    }

    public rectanglee(int lenth, int breadth) {
        this.lenth = lenth;
        this.breadth = breadth;
    }

    public int getLenth() {
        return this.lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

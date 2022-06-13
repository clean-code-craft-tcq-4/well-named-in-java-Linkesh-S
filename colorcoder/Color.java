package colorcoder;

public static interface Color{
  public int index;
  int getIndex() {
            return index;
        }
        public static <E extends Enum<E>& Color>E fromIndex(int index) {
            for(E color: E.values()) {
                if(color.getIndex() == index) {
                    return color;
                }
            }
            return null;
        }
}
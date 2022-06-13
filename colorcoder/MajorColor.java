package colorcoder;

enum MajorColor implements Color{
        WHITE(0),
        RED(1),
        BLACK(2),
        YELLOW(3),
        VIOLET(4);
  
        @Override
        int getIndex() {
            return index;
        }
        private MajorColor(int index) {
            this.index = index;
        }

    };

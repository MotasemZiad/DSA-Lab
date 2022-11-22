package Quizzes.FirstQuiz;

class Rectangle extends Shape {
    private Dimension dimension;

    public Rectangle(Rectangle.Dimension dimension) {
        this.dimension = dimension;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle [dimension=" + dimension + "]";
    }

    @Override
    public double getArea() {
        return dimension.length * dimension.width;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public static class Dimension {
        private double length;
        private double width;

        public Dimension() {
        }

        public Dimension(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public String toString() {
            return "Dimension [length=" + length + ", width=" + width + "]";
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }
    }

}
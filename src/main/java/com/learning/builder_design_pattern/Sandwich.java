package com.learning.builder_design_pattern;

/**
 * Builder Design Pattern Example for a Sandwich
 * This class demonstrates how to use the Builder pattern to create a Sandwich object.
 * It allows for flexible construction of a Sandwich with various optional ingredients.
 * @author srinivasaimandi
 */
public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private String vegetables;
    private String condiments;
    private boolean toasted;
    private boolean cutInHalf;
    private boolean wrapped;
    private String sauce;

    private Sandwich(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetables = builder.vegetables;
        this.condiments = builder.condiments;
        this.toasted = builder.toasted;
        this.cutInHalf = builder.cutInHalf;
        this.wrapped = builder.wrapped;
        this.sauce = builder.sauce;
    }

    public String getBread() {
        return bread;
    }
    public String getMeat() {
        return meat;
    }
    public String getCheese() {
        return cheese;
    }
    public String getVegetables() {
        return vegetables;
    }
    public String getCondiments() {
        return condiments;
    }
    public boolean isToasted() {
        return toasted;
    }
    public boolean isCutInHalf() {
        return cutInHalf;
    }
    public boolean isWrapped() {
        return wrapped;
    }
    public String getSauce() {
        return sauce;
    }
    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", condiments='" + condiments + '\'' +
                ", toasted=" + toasted +
                ", cutInHalf=" + cutInHalf +
                ", wrapped=" + wrapped +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class Builder {
        private String bread;
        private String meat;
        private String cheese;
        private String vegetables;
        private String condiments;
        private boolean toasted = false;
        private boolean cutInHalf = false;
        private boolean wrapped = false;
        private String sauce;

        public Builder(String bread) {
            this.bread = bread;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder vegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder toasted(boolean toasted) {
            this.toasted = toasted;
            return this;
        }

        public Builder cutInHalf(boolean cutInHalf) {
            this.cutInHalf = cutInHalf;
            return this;
        }

        public Builder wrapped(boolean wrapped) {
            this.wrapped = wrapped;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}

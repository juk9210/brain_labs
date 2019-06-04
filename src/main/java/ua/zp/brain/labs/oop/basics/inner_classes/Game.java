package ua.zp.brain.labs.oop.basics.inner_classes;

/**
 * Create class GameConsole.
 *
 * @author Shakhov Yevhen.
 */

class Game {
    /**
     * Describe final fields.Create enums for all possible fields.Create get for fields.
     */
    private final String name;
    private final Genre genre;
    private final Type type;

    enum Type {
        PHYSICAL,
        VIRTUAL,
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    /**
     * Create private constructor with parameters.
     *
     * @param name
     * @param genre
     * @param type
     */
    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    /**
     * Create inner static class GameDisk.
     */
    static class GameDisk {
        /**
         * Create finale fields - description(description of game) and data.Create get for fields.
         */
        final String description;
        final Game data;

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }

        /**
         * Create private constructor GameDisk with parameters.Create instance of class Game and pass in it the name,
         * genre and fixed parameter of type.Initialize field of description.
         *
         * @param description
         * @param name
         * @param genre
         */
        private GameDisk(String name, Genre genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, Type.PHYSICAL);
        }
    }

    /**
     * Create static class VirtualGame.
     */
    static class VirtualGame {
        /**
         * Create fields -  rating(rating of game - from 0 to 5) and  final data.Create get/set for fields.
         */
        private int rating;
        private final Game data;

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public Game getData() {
            return data;
        }

        /**
         * Create private constructor VirtualGame with parameters.Create instance of class Game and pass in it the name,
         * genre and fixed parameter of type.
         *
         * @param name
         * @param genre
         */
        private VirtualGame(String name, Genre genre) {
            this.data = new Game(name, genre, Type.VIRTUAL);
        }
    }

    /**
     * Create static method getDisk with parameters.Create instance of class GameDisk and return this instance.
     *
     * @param description
     * @param name
     * @param genre
     * @return
     */
    static GameDisk getDisk(String name, Genre genre, String description) {
        GameDisk disk = new GameDisk(name,genre,description);
        return disk;
    }
    /**
     * Create static method getVirtualGame with parameters.Create instance of class VirtualGame and return this
     * instance.
     *
     * @param name
     * @param genre
     * @return
     */
    static VirtualGame getVirtualGame(String name, Genre genre) {
        VirtualGame virtual = new VirtualGame(name,genre);
        return virtual;
    }
}

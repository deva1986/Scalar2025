class DummyBook implements Lendable {

    private boolean available = true;

    @Override
    public boolean lend(User user) {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

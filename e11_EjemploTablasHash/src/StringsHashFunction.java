public class StringsHashFunction implements IHashFunction<String> {
    private final int internalVectorSize;

    public StringsHashFunction(int internalVectorSize) {
        if (internalVectorSize <= 0) {
            throw new IllegalArgumentException("El tamaño del vector debe ser mayor que 0");
        }
        this.internalVectorSize = internalVectorSize;
    }

    @Override
    public int getKey(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El valor no puede ser nulo");
        }
        return Math.abs(value.hashCode()) % internalVectorSize;
    }
}

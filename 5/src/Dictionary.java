public class Dictionary extends PairMap {
	protected String keyArray[];
	protected String valueArray[];
	int index;
	public Dictionary(int n) {
		this.keyArray = new String[n];
		this.valueArray = new String[n];
		this.index = 0;
	}
	String get(String key) {
		for (int i=0; i<keyArray.length; i++) {
			if (key.equals(keyArray[i])) return valueArray[i];
		}
		return null;
	}
	public void put(String key, String value) {
		for (int i=0; i<keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
		keyArray[index] = key;
		valueArray[index] = value;
		index++;
	}
	public String delete(String key) {
		for (int i=0; i<keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = null;
				String s = valueArray[i];
				valueArray[i] = null;
				return s;
			}
		}
		return null;
	}
	public int length() {
		return index;
	}
}

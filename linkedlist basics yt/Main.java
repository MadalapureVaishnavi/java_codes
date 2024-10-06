import java.util.*;

public class Main {

    public static boolean findMaxFits(List<Integer> parcels, int cap, int extraParcels) {
        for (int i = 0; i < parcels.size() && extraParcels > 0; i++) {
            int diff = cap - parcels.get(i);
            if (diff > 0) {
                extraParcels -= Math.min(extraParcels, diff);
            }
        }
        return extraParcels == 0;
    }

    public static void main(String[] args) {
        List<Integer> parcels = Arrays.asList(1, 2, 3);
        int extraParcels = 3;

        int low = Collections.min(parcels);
        int high = extraParcels + Collections.max(parcels);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findMaxFits(parcels, mid, extraParcels)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimized max parcels: " + low);
    }
}

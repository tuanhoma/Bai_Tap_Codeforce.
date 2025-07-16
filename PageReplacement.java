import java.util.*;

public class PageReplacement {
    static final int FRAME_SIZE = 4;
    static final String[] referenceString = {
            "e", "c", "b", "e", "a", "g", "d", "c", "e", "g", "d", "a"
    };

    public static void main(String[] args) {
        System.out.println("=== Page Replacement Algorithms ===\n");

        int fifoFaults = fifo();
        int lruFaults = lru();
        int optimalFaults = optimal();

        System.out.println("FIFO Page Faults   = " + fifoFaults);
        System.out.println("LRU Page Faults    = " + lruFaults);
        System.out.println("Optimal Page Faults= " + optimalFaults);
    }

    // FIFO Algorithm
    public static int fifo() {
        Queue<String> memory = new LinkedList<>();
        Set<String> pages = new HashSet<>();
        int faults = 0;

        for (String page : referenceString) {
            if (!pages.contains(page)) {
                if (memory.size() == FRAME_SIZE) {
                    String removed = memory.poll();
                    pages.remove(removed);
                }
                memory.offer(page);
                pages.add(page);
                faults++;
            }
        }
        return faults;
    }

    // LRU Algorithm
    public static int lru() {
        LinkedHashMap<String, Integer> memory = new LinkedHashMap<>();
        int faults = 0;

        for (int i = 0; i < referenceString.length; i++) {
            String page = referenceString[i];

            if (!memory.containsKey(page)) {
                if (memory.size() == FRAME_SIZE) {
                    // Tìm trang dùng lâu nhất
                    String lruPage = Collections.min(memory.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
                    memory.remove(lruPage);
                }
                faults++;
            }
            memory.put(page, i); // cập nhật lần dùng gần nhất
        }

        return faults;
    }

    // Optimal Algorithm
    public static int optimal() {
        List<String> memory = new ArrayList<>();
        int faults = 0;

        for (int i = 0; i < referenceString.length; i++) {
            String page = referenceString[i];

            if (!memory.contains(page)) {
                if (memory.size() == FRAME_SIZE) {
                    int farthest = -1;
                    int indexToRemove = -1;

                    for (int j = 0; j < memory.size(); j++) {
                        String memPage = memory.get(j);
                        int nextUse = Integer.MAX_VALUE;

                        for (int k = i + 1; k < referenceString.length; k++) {
                            if (referenceString[k].equals(memPage)) {
                                nextUse = k;
                                break;
                            }
                        }

                        if (nextUse > farthest) {
                            farthest = nextUse;
                            indexToRemove = j;
                        }
                    }

                    memory.remove(indexToRemove);
                }
                memory.add(page);
                faults++;
            }
        }

        return faults;
    }
}
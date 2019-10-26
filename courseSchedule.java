 public boolean canFinish(int numCourses, int[][] lists) {
        
      if (lists == null || lists.length == 0) {
            return true;
        }
      
      
      int from = 0, to = 0;
      boolean[] edges = new boolean[lists.length];
      boolean found = true;

      int[] count = new int[numCourses];
      
        for (int i = 0; i < lists.length; i++) {
            int key = lists[i][1];
            count[key]++;
        }


        while (found) {
            found = false;
            for (int i = 0; i < lists.length; i++) {
                if (!edges[i]) {
                    from = lists[i][0];
                    to = lists[i][1];

                    if (count[from] == 0 && count[to] != 0) {
                        edges[i] = true;
                        found = true;
                        count[to]--;
                    }
                }
            }
        }

        for (int i : count) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

package io.wesley.iadi;

class RijBewerkingen {
    private final char[] rij;

    RijBewerkingen(char[] rij) {
        this.rij = rij;
    }

    /**
     * Linear search implementation
     *
     * @param target the char to find the index of
     * @return als target voorkomt in de rij dan wordt de index van target teruggegeven
     * als target niet voorkomt dan wordt -1 teruggegeven.
     */
    int lineair_zoeken(char target) {
        for (int i = 0; i < rij.length; i++) {
            if (rij[i] == target) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Binary search implementation
     *
     * @param target the char to find the index of
     * @return als target voorkomt in de rij dan wordt de index van target teruggegeven
     * als target niet voorkomt dan wordt -1 teruggegeven.
     */
    int binair_zoeken(char target) {
        int top = rij.length;
        int bottom = 0;
        while (bottom <= top) {
            int mid = (int) Math.floor(top / 2);
            if (rij[mid] == target) {
                return (mid);
            }

            if (rij[mid] < target) {
                top = mid - 1;
            } else {
                bottom = mid + 1;
            }
        }
        return -1;
    }


    // de rij wordt in oplopende volgorde gesorteerd
    // met de 'bubble-sort'-methode
    void bubble() {
        // nog afmaken ...
        int ondgrens;
        int loper;
        for (ondgrens = 1; ondgrens < rij.length; ondgrens++) {
            for (loper = rij.length - 1; loper < ondgrens ; loper--) {
                if (rij[loper - 1] > rij[loper]) {
                    char tmp = rij[loper - 1];
                    rij[loper - 1] = rij[loper];
                    rij[loper] = tmp;
                }
            }
        }
    }

    void print() {
        for (char c : rij) {
            System.out.print(c + "  ");
        }
        System.out.println();
    }

}
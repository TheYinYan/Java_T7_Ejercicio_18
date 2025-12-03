## Getting Started

        for (int i = 0; i < aux.length; i += 2) {
            if (nMin > 0 && nMax > 0) {
                aux[i] = posicionMin[min++];
                nMin--;
                aux[i + 1] = posicionMax[max++];
                nMax--;
            }
            if (nMin <= 0 && nMax > 0) {
                aux[i + 1] = posicionMax[max++];
                nMax--;
            }
            if (nMin > 0 && nMax <= 0) {
                aux[i + 1] = posicionMin[min++];
                nMin--;
            }
        }

        
/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++
*/
#include <iostream>
using namespace std;

int main()
{
	const int NUM_FISH = 20;
	int fish[NUM_FISH];

    for (int i = 0; i < NUM_FISH; i++) {
        cout << "\nFisherman " << i+1 << endl << "How many fish were caught?\n";
        cin >> fish[i];
        cout << "ok, " << fish[i] << " fish were caught\n";
    }
	// You must finish this program. It should ask how
	// many fish were caught by fishermen 1-20, and
	// store this data in the array fish.

	return 0;
}


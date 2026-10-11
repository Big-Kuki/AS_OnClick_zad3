W poprzedniej wersji używałem lambdy dla przycisku +1 oraz wspólnego View.OnClickListener dla przycisków -1 i Reset.

Terqaz używam klasa MainActivity implementuje interfejs View.OnClickListener. 
Wszystkie trzy przyciski mają przypisaną aktywność przez setOnClickListener(this), 
a obsługa kliknięć znajduje się w jednej metodzie onClick(View v). 
Przycisk rozpoznaję za pomocą v.getId().

Wersja z lambdami jest krótsza i pozwala bezpośrednio przypisać działanie do przycisku.
Wersja z implements View.OnClickListener wymaga dodatkowej deklaracji interfejsu i metody onClick().

View.OnClickListener lepiej użyj jak chcemy więcej przycisków bo cała obsługa zdarzeń jest w jednym miejscu,
trzeba dopisac tylko kolejne warunki w onClick()
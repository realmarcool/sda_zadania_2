# sda_zadania_2
Zadania domowe przewidziane na okres 29.07 – 04.08
Na ten okres zostało przygotowane jedno spore zadanie, które pozwoli wam stworzyć
jeden większy program.
Celem zadania jest stworzenie aplikacji, która pozwoli zarządzać pracownikami w małej
firmie. Aplikacja ma opierać się na rzeczach, które już poznaliście: klasach,
dziedziczeniu, interfejsach, klasach abstrakcyjnych, listach itp.

Aplikacja powinna zawierać takie funkcjonalności:
- Dodanie nowego pracownika (w tym wybór jaki to jest pracownik np. Prezes będzie posiadał dodatkowe pola 
w klasie niż księgowy itp.)
- Usunięcie danego pracownika po unikalnym ID
- Wyszukanie pracownika po ID, Imieniu, Nazwisku, Stanowisku
- Wyświetlenie listy wszystkich pracowników
- Wyświetlenie pracowników dla wybranego typu (np. Stanowisko)
- Dodanie weryfikacji czy dany pracownik nie jest już dodany do bazy
- Każdy pracownik powinien posiadać dane adresowe oraz dane o placówce, w której pracuje (firma posiada sporo swoich oddziałów)
- Po każdej operacji wykonanej przez użytkownika powinno zostać wyświetlone ponownie Menu aplikacji. 
(pomyśleć nad funkcją, która będzie zajmować się jego wyświetlaniem)

Aplikacja powinna być bardzo dobrze zaprojektowana, gdyż będzie ona dalej rozwijana.
Jak będziecie ją tworzyć to myślcie o tym, aby można było ją w łatwy sposób rozwijać.
Zalecam na kartce papieru rozrysować sobie wszystkie klasy i ich pola (uwierzcie mi, że
to ułatwi wam zadanie).
Oprócz aplikacji proszę wykonać schemat blokowy, na którym zostanie pokazany
proces dodawania nowego pracownika.
Do stworzenia schematu blokowego wykorzystajcie https://www.draw.io – pozwala
zapisywać diagramy od razu na waszym koncie na GitHub.
Wskazówki:
• Jako bazę traktujemy kontener - w naszym przypadku będzie to lista – ArrayList
• Powinna zostać stworzona klasa abstrakcyjna, po której będą dziedziczyć
konkretne typy pracowników
• Powinna powstać klasa, która będzie opisywała oddziały firmy
• Powinien zostać stworzony ENUM, który będzie posiadał wszystkie stanowiska
dostępne w danej firmie.
• Menu powinno być oparte na pętli while.
• Unikalne ID pracownika powinno generować się samo(użytkownik przy
dodawaniu pracownika nie powinien go wprowadzać)Dodatkowe funkcjonalności:
• Zapis bazy danych(kontenera) do pliku txt (np. w formacie CSV)
• Odczyt bazy danych z pliku txt
• Dodanie do obecnego kontenera (bazy danych) danych, które zostaną z czytane z
pliku txt (np. Posiadamy już bazę danych 10 pracowników, ale chcemy dodać
kolejnych 100, którzy znajdują się w pliku txt)
• Stworzenie ładniejszego GUI konsolowego (poprawienie wyświetlania danych w
konsoli)
• Dodanie możliwości przeglądania pracowników w konsoli. Tak jak jest to
robione w galeriach zdjęciowych na stronach www. Użytkownik po kliknięciu
przycisku będzie mógł przejść do kolejnego lub poprzedniego pracownika.
Wykorzystać wiedzę, która została zdobyta na całym kursie.

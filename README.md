PERCOBAAN 1
1. komponen perulangan FOR pada percobaan 1
jawab : 
> inisialisasi : int i = 1 -men-set variabel penghitung sebelum loop mulai
> kondisi      : i <= 1    -selama kondisi true, loop berjalan
> update       : i++       -dieksekusi setiap akhir literasi untuk memperbarui penghitung

2. kenapa tertinggi 0 dan terendah 100
jawab :
alasannya : Nilai siswa yang di asumsikan di rentang 0-100.
> tertinggi : diinisialisasi 0 supaya setiap nilai valid (>0) dapat menggantikan nilai tertinggi awal jika lebih besar.
> terendah  : diinisialisasi 100 supaya setiap nilai valid (<100>) dapat menggantikan terendah awal jika lebih kecil.

3. fungsi alur kerja dari potongan berikut
jawab :
> Fungsinya untuk membandingkan nilai yang baru di input dengan nilai maksimum/minimum saat ini.
> Alur : 
  1. input nilai siswa (setiap literasi for)
  2. cek apakah nilai lebih besar dari tertinggi. jika ya, update tertinggi.
  3. cek apakah nilai lebih kecil dari terendah. jika ya, update terendah.
  4. setelah loop selesai, variabel tertinggi dan terendah memulai nilai maksimum/minimum dari seluruh input. 

4. Modifikasi hitung jumlah mahasiswa
jawab : commit


PERCOBAAN 2
1. a> arti nilai <0 || nilai > 100
      jawab : jika nilai yang dimasukkan tidak berada di antara 0 sampai 100, maka program akan menjalankan bagian kondisi khusus untuk menandai bahwa input tersebut tidak valid.
   b> arti perintah continue
      jawab : perintah continue membuat program melewati sisa baris kode setelahnya dan langsung kembali ke awal perulangan untuk mengulang input berikutnya.

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
    jawab : 
    > letak i++ di akhir perulangan supaya nilai penghitung tidak bertambah duluan sebelum kode lain dijalankan.
    > jika i++ diletakkan di bagian atas, maka penghitungan akan maju lebih cepat, sehingga perulangan akan mulai dari angka ke-2 (misalnya dari 2, bukan dari 1).

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
    jawab : jumlah perulangannya tetap 19 kali, karena nilai awal i dimulai dari 0, dan kondisi loop adalah i < jml.

PERCOBAAN 3
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
    jawab : jika pada input pertama pengguna langsung mengetik "batal", maka perulangan tetap berjalan satu kali karena tipe do-while selalu menjalankan isi perulangan terlebih dahulu sebelum memeriksa kondisinya.
    namun setelah itu, program akan langsung berhenti karena ada perintah break; di dalam blok kode.

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
    jawab : kondisi berhenti pada perulangan ini terjadi saat pengguna mengetik kata "batal" sebagai nama pelanggan. 
            saat kondisi itu terpenuhi, program akan menjalankan perintah break; yang langsung menghentikan proses perulangan tanpa menunggu akhir loop.

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
    jawab : kata true pada while(true) digunakan agar perulangan berjalan tanpa batas (infinite loop).
            program akan terus berulang sampai ada perintah break; atau kondisi tertentu di dalamnya yang menghentikan secara manual.

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
    jawab : meskipun tidak ada inisialisasi atau kenaikan variabel di luar loop, perulangan tetap berjalan karena semua kontrolnya diatur dari dalam blok perulangan.
            Proses berhenti sepenuhnya bergantung pada kondisi atau perintah yang dibuat di dalam { ... } dan pada bagian while(kondisi);.




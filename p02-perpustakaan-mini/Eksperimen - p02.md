# Jawaban Eksperimen Praktikum 6: Perpustakaan Mini

Mata Kuliah: Pemrograman Berbasis Objek 2 (TIF1508)
Pertemuan 2: Review OOP melalui Studi Kasus Perpustakaan Mini

> Catatan: samakan pesan error di bawah dengan yang muncul di NetBeans milik sendiri, lalu sesuaikan kalimatnya bila berbeda.

---

## Eksperimen 1: Membuat object dari abstract class

**Yang diubah:** menambahkan baris berikut di method `main`.

```java
Koleksi x = new Koleksi("X01", "Uji", 2026);
```

**Hasil:** kompiler menampilkan error `Koleksi is abstract; cannot be instantiated`.

**Penjelasan:** `Koleksi` dideklarasikan sebagai `abstract class`, sehingga hanya berfungsi sebagai kerangka bersama dan tidak boleh dibuat object-nya langsung dengan `new`. Object harus dibuat dari subclass konkret seperti `Buku` atau `Majalah`. Hal ini masuk akal karena setiap koleksi pasti berjenis tertentu, dan aturan seperti `hitungDenda()` baru jelas setelah jenisnya diketahui.

---

## Eksperimen 2: Mengubah nama method `hitungDenda` menjadi `hitungdenda` di kelas `Buku`

**Yang diubah:** pada `Buku.java`, nama method `hitungDenda` diganti menjadi `hitungdenda` (huruf d kecil).

**Kasus A, anotasi `@Override` masih ada:**
Kompiler menampilkan error `method does not override or implement a method from a supertype`. Java membaca `hitungdenda` sebagai method baru yang berbeda dari `hitungDenda`, sehingga `@Override` tidak menemukan method yang di-override.

**Kasus B, anotasi `@Override` dihapus:**
Kompiler tetap error, tetapi dengan pesan berbeda: `Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam`. Method `hitungdenda` dianggap method baru yang sah, sedangkan method `hitungDenda` dari interface `BisaDipinjam` belum diisi. Karena `Buku` bukan abstract class, ia wajib mengisinya.

**Penjelasan:** `@Override` membuat salah ketik nama method langsung ketahuan dengan pesan yang menunjuk tepat ke penyebabnya. Tanpa anotasi itu, error tetap muncul, tetapi pesannya lebih tidak langsung dan penyebab aslinya (salah ketik) lebih sulit dikenali.

---

## Eksperimen 3: Membuat Buku dengan judul kosong

**Yang diubah:** menambahkan baris berikut di method `main`.

```java
perpus.tambah(new Buku("B009", "", 2020, "Anonim"));
```

**Hasil:** program berhenti saat dijalankan dengan `Exception in thread "main" java.lang.IllegalArgumentException: Judul tidak boleh kosong`.

**Penjelasan:** konstruktor `Koleksi` memeriksa `judul == null || judul.isBlank()`. Judul `""` kosong, sehingga konstruktor melempar `IllegalArgumentException` dan object tidak pernah terbentuk. Ini contoh enkapsulasi: aturan bisnis (judul wajib diisi) dijaga di dalam class itu sendiri, sehingga data yang tidak sah tidak bisa masuk ke sistem.

---

## Eksperimen 4: Mengubah atribut `status` menjadi public

**Yang diubah:**
1. Pada `Koleksi.java`, `private StatusKoleksi status` diubah menjadi `public StatusKoleksi status`.
2. Pada `main`, setelah B002 dipinjam Siti, ditambahkan:

```java
perpus.cari("B002").status = StatusKoleksi.TERSEDIA;
cetakPinjam(perpus, "B002", budi);
```

**Hasil:** kode berhasil dikompilasi, dan status B002 kembali menjadi `TERSEDIA` padahal masih dipinjam Siti. Akibatnya Budi berhasil meminjam B002 (`Budi Santoso meminjam B002: berhasil`), padahal seharusnya gagal.

**Aturan yang dilanggar:** **enkapsulasi**. Status seharusnya hanya berubah melalui `pinjam()` dan `kembalikan()`, sehingga koleksi yang sedang dipinjam tidak dapat dipinjam lagi. Dengan atribut `public`, kode di luar class bisa melewati aturan itu dan membuat data tidak konsisten. Pencatatan peminjam di `Perpustakaan` juga ikut tidak sinkron dengan status koleksi.

---

## Kesimpulan

| No | Konsep yang dibuktikan |
|---|---|
| 1 | Abstract class tidak bisa dibuat object dengan `new` |
| 2 | `@Override` membuat salah ketik nama method langsung ketahuan |
| 3 | Konstruktor menjaga aturan bisnis (judul tidak boleh kosong) |
| 4 | Atribut `private` menjaga aturan status koleksi (enkapsulasi) |

Setelah setiap eksperimen selesai, kode dikembalikan seperti semula sehingga keluaran program kembali sama dengan contoh pada modul.

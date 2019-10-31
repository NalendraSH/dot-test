## Knowledge & Experience Questions

1. Apakah anda pernah menggunakan Kotlin? Jika pernah jelaskan perbedaan mendasar antara Kotlin dengan Java sesuai dengan pengalaman anda. 
2. Apa saja library Android yang sering atau biasa anda pakai? Jelaskan kegunaannya bagi anda. 
3. Apakah anda menggunakan prinsip clean code atau design pattern untuk project Android anda? Jelaskan penerapan clean code atau design pattern yang biasa anda gunakan dan manfaatnya untuk anda. 
4. Apakah tantangan terbesar yang pernah anda temui dalam mengerjakan project Android dan bagaimana anda menyelesaikannya dari sisi engineering? 
5. Untuk efisiensi pengerjaan project dalam tim, bagaimana workflow anda dari proses development hingga merilis aplikasi hingga bisa digunakan oleh tester / client? 
6. Jelaskan teknik-teknik apa saja yang dapat meningkatkan performance dan keamanan sebuah aplikasi Android. 
7. Apakah anda bersedia onsite di Malang? 

## Knowledge & Experience Answer

1. Pernah. Menurut saya, syntax di kotlin terbilang lebih ringkas dan tidak bertele-tele. Misalnya pengilangan keyword "new" dan semicolon yang sebelumnya masih ada pada java. Selain itu kotlin juga memiliki sistem null safety, misalnya kotlin dapat membedakan variabel yang nullable dan tidak dengan menggunakan keyword "?".
2. Picasso, material design, anko. Picasso saya gunakan untuk meload gambar dari url atau drawable kedalam layout xml. Material design saya gunakan untuk mempercantik tampilan UI. Beberapa yang sering saya gunakan adalah cardview dan text input layout. Anko sendiri merupakan library untuk bahasa pemrograman kotlin yang saya gunakan untuk meringkas code. Misalnya saya dapat meringkas "Toast.makeText(context, "text", duration).show()" menjadi "toast("text")".
3. Saya menggunakan design pattern, khususnya MVP untuk project-project Android saya. Menurut saya, design patter MVP mempermudah saya dalam proses debugging jika terjadi bug. Saya dapat dengan mudah men-track code sesuai lingkup permasalahannya. Misalnya, jika terjadi error saat request/networking, saya dapat langsung menuju bagian presenter, api manager atau api service untuk mencari sumber permasalahannya.
4. Tantangan terbesar yang saya alami adalah maintenance project lama yang skalanya agak besar dan dokumentasinya cukup berantakan. Yang saya lakukan untuk mengatasi permasalahan tersebut adalah membaca/memahami alur code sambil mendokumentasikannya.
5. Sewaktu saya di Aksamedia, saya membuat list-to-do menggunakan trello dan menentukan batas waktu pengerjaan untuk segala aspek aplikasi, entah itu dari design, api, maupun code.
6. Sejauh yang saya dapatkan dari Aksamedia, untuk meningkatkan performance aplikasi, saya sebisa mungkin menggunakan layout container bertipe constraint layout dan menghindari relative layout. Selain itu, saya juga menghindari hardcode image url src di xml. Sebagai alternatifnya, saya meload url menggunakan Picasso.
7. Kondisi saya sekarang tidak memungkinkan untuk memberikan ketersediaan waktu untuk onsite di Malang. Saya masih menempuh perkuliahan di Surabaya dan saya sendiri masih semester tujuh. Kemungkinan lulusnya sendiri masih satu tahun lagi.

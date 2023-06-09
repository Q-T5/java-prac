JAVA STREAMS
Streams- sequence of data that are read from the source and written to the destination.

INPUT AND OUTPUT STREAMS
Input streams- read data from the source relative to your program.
Output streams- write data to the destination relative to your program. Example is the System.out

TYPES OF STREAMS
Classified into two depending on the data a stream holds:
    1. Byte stream
    Used to read and write a single byte (8 bits) of data.
    All byte stream classes are drived from base abstract classes namely:
        InputStream and OutputStream

    NB: For tutorials on this stream, look into the 'ByteStreams' folder. Order of reading
        1. Java InputStream
        2. Java OutputStream
        3. Java FileInputStream
        4. Java FileOutputStream
        5. Java ByteArrayInputStream
        6. Java ByteArrayOutputStream
        7. Java ObjectInputStream
        8. Java ObjectOutputStream
        9. Java BufferedInputStream
        10. Java BufferedOutputStream
        11. Java PrintStream


    2. Character stream
    Used to read and write a single character of data
    All character stream classes are derived from base abstract classes namely:
        Reader and Writer

    NB: For tutorials on this stream, look into the 'CharacterStreams' folder. Order of reading
        1. Java Reader
        2. Java Writer
        3. Java InputStreamReader
        4. Java OutputStreamWriter
        5. Java FileReader
        6. Java BufferedReader
        7. Java BufferedWriter
        8. Java StringReader
        9. Java StringWriter
        10. Java PrintWriter
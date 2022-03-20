### Abstracut Factoryクラス
    - 関連したり依存し合うオブジェクト群のインスタンスを生成することができる。
    - 別名「Kit」とも呼ばれる。


1. 利用シーン・メリット

   - Abstract Factoryパターンは以下のような場合に利用する。
   - Product（部品）が複数存在する場合
   - Product（部品）が拡張する可能性がある場合
   - 実行環境（OS、DB、プラットフォーム、バージョンなど）に追加や変更が生じる場合


2. 注意点、問題点

   - OsSoundSystemという音響システムの部品を追加しようとした場合、 AbstractFactorクラスにcreateSoundメソッドを追加する必要がある。
   つまり、サブクラス全てにcreateSoundメソッドを追加するということである。
   そのため、生成する部品についてもあらかじめ網羅しておくと、後々の保守が楽になる。


3. 他のパターンとの関連

    a. Singletonパターン
      - ConCreate Factoryクラスは通常、1つだけ生成すれば良いため、Singletonパターンが利用されることがある。

    b. Prototypeパターン
      - ConcreateProductクラスを生成する際に、Propertyパターンでインスタンスを生成する必要がある。

    c. Factory Methodパターン
      - ConCreateFactoryクラスでは、FactoryMethodパターンを利用して、ConcreateProductを生成する。


4. サンプルコードの解説

   a. AbstractProduct
        抽象的な部品。
        このクラスで部品のインターフェースを定義しておく。
        今回の実装では、OsFileSystemがこれに該当する。

    b. ConcreateFactory
        具体的な工場。
        このクラスから、具体的な部品（ConcreateProduct）を生成する。
        今回の実装では、WindowsFactory、LinuxFactoryクラスがこれに該当する。

    c. ConcreateProduct
        具体的な部品で、このクラス内で処理を実装する。
        今回の実装では、WindowsDisplaySystem、WindowsFileSystem、LinuxDisplaySystem、LinuxFileSystemクラスがこれに該当する。
        - ファイルセパレータ（/や¥）の取得
        - ルートパスの取得
        - ファイルの保存

    d. WindowsFactory
        Windows用システムの工場。
        Windows用のディスプレイシステム、ファイルシステムのインスタンスを生成するメソッドを実装する。

    e. WindowsDisplaySystem
         Windows用のディスプレイシステム。
         OsDisplaySystemクラスの中小メソッドを実装する。 

    f. WindowsFileSystem
        Windows用のファイルシステム。
        OsFileSystemクラスの抽象メソッドを実装する。

    g. LinuxFactory
        Linux用システムの工場。
        Linux用ディスプレイシステム、ファイルシステムのインスタンスを生成するメソッドを実装する。 

    h. LinuxDisplaySystem
        Linux用のディスプレイシステム。
        OsDisplay Systemクラスの抽象メソッドを実装する。
        
    i. LinuxFileSystem
        Linux用ファイルシステム。
        OsFileSystemクラスの抽象メソッドを実装する。

5. まとめ

   - 複数のサブクラス群をまとめて変更したい場合、AbstractFactoryパターンを利用する。
   - Factoryクラス、Productクラスを抽象化する（インターフェースは決めておく）。
   - Factorクラスに、Factoryのサブクラスのインスタンスを生成するstatic、メソッドを用意する。


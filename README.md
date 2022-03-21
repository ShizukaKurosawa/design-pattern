### Adapterパターン
あるクラスのインターフェースを、別のインターフェースに変換することができる。

1. 実装方法
  - 継承を利用して実装する方法
  - 委譲を利用して実装する方法

2. サンプルコードの解説
  - Show
    文字列と数値を出力するメソッドを持ったクラス。

  - Print
    バージョン2から利用する文字列と数値を出力するメソッドを持ったインターフェース。

  - PrintAdapter
    Adapterを表すクラス。
    PrintインターフェースとShow1を継承している。
    Printインターフェースのメソッドが呼びだされたら、Showクラスのメソッドを呼び出す。

  - Main
    文字列と数値の出力を依頼する。

  Adapterパターンでは、以下のクラスを作成する。

  - Target
    Clientが必要なインターフェースを表すクラス。
    今回は、Printインターフェースがこれに該当する。

  - Client
    Targetを扱うクラス。
    今回は、Mainクラスがこれに該当する。

  - Adapter
    適合される側を表すクラス。
    今回は、Showクラスがこれに該当する。

  - Adapter
    Taregサブクラスであり、適合を表すクラス。
    今回は、PrintAdapterクラスがこれに該当する。


3. 注意点・問題点
  - 継承を利用したAdapterパターンは、継承できるAdapterが1つのみになる。

  - Javaでは、インターフェースは複数継承できるが、クラスの継承は、1つのみになる。
  複数のAdapterを利用する場合は、委譲を利用したAdapterパターンで作成する必要がある。

4. 他のパターンとの関連
  - Bridgeパターン
    BridgeパターンとAdapterオアターンは構造が似ているが、目的が異なる。
    Bridgeパターンは昨日と実装を分けることが目的であるが、Adapterおパターンは、異なるインターフェースを変換することが目的である。

  - Decoratorパターン
    Decoratoeパターンでは、インターフェースを変更することなく、機能を追加できる。
    Adapterパターンでは、インターフェースのズレを埋める。

5. まとめ
  - Adapterパターンは、異なるインターフェース同士を変換する。
  - 実装方法は、以下の2つである。
    a. 継承を利用する
    b. 委譲を利用する

    
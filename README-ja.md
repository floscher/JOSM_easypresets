# JOSM EasyPresets Plugin

簡単にプリセットを作って使用することができます。このプラグインは "プリセット" メニューに新しいメニューを追加します。
また、JOSMのプリセットとして使うことのできるXMLをエクスポートすることが可能です。
サポートしているのはプリセットファイル仕様の一部ですが、配布用プリセットの作成が少し楽になります。

## プリセットを作成する
* 元にしたいノードやウェイを選択した状態で "Create Preset" を選択します。
* プリセット作成ダイアログが開きます。不要なタグは "Use" 欄にチェックに入れればプリセットに含まれません。
* このプラグインは2通りのタグ設定をサポートしています。"Editable" にチェックを入れれば編集可能なテキストボックスに、チェックを入れなければキーと値のペアが自動で入るようになります。
* 作成したプリセットは後で編集することができます。

## 作ったプリセットを使う
* 作成したプリセットは一般のプリセットと同様に使用することができます。検索の対象にもなります。
* 作成したプリセットはすべて "プリセット > Custom presets" メニューに表示されます。

## プリセットを管理する
* "プリセット > Manage custom presets" メニューを選ぶと、プリセットを編集・削除・エクスポートできます。 

## その他
* このプラグインは作成したカスタムプリセットをJOSMのユーザデータディレクトリに "EasyPresets.xml" というファイル名で保存します。
* 作成したプリセットのソートやグループ分けは今のところサポートしておりませんが、今後サポート予定です。
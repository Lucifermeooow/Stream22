import 'package:flutter_test/flutter_test.dart';
import 'package:streamgit101/main.dart';

void main() {
  testWidgets('StreamGit101 renders', (WidgetTester tester) async {
    await tester.pumpWidget(const StreamV21App());

    expect(find.byType(StreamV21App), findsOneWidget);
  });
}

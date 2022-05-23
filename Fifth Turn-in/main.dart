import 'package:flutter/material.dart';
import 'icons.dart';
import 'user.dart';
import 'ad.dart';

void main() {
  runApp(MaterialApp(
    home: Home()
  ));
}

class Home extends StatelessWidget {
  const Home({Key? key}) : super(key: key);

  Widget favoriteAdCard()

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          onPressed: () {},
          icon: Icon(
              FontAwesome4.menu,
            color: Color(0xFF252540),
          ),
        ),
        title: Text(
          'tortoise',
          style: TextStyle(
              fontFamily: 'STHeitiLight',
              fontSize: 16.0,
              letterSpacing: 2.0,
              color: Color(0xFF252540),
          ),
        ),
        actions: [
          CircleAvatar(
            backgroundImage: AssetImage('assets/profile_image_pm.png'),
            radius: 20,
          ),
        ],
        centerTitle: true,
        backgroundColor: const Color(0xFFD8B6AF),
      ),
      body: Padding(
        padding: EdgeInsets.fromLTRB(19.0, 30.0, 19.0, 0.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Row(
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                IconButton(
                  onPressed: () {},
                  icon: Icon(FontAwesome4.left_open),
                ),
                Text(
                  'Question',
                  style: TextStyle(
                      color: Color(0xFF252540),
                      fontFamily: 'SFProDisplay',
                      fontSize: 30.0
                  ),
                ),
              ],
            ),
            SizedBox(height: 4.0),
            Text(
              'from Maria Stefanou',
              style: TextStyle(
                  color: Color(0xFF252540),
                  fontFamily: 'SFProDisplay',
                  fontSize: 12.0,
                  letterSpacing: 1.0,
              ),
            ),
            Text(
              'for ad with id ',
              style: TextStyle(
                color: Color(0xFF252540),
                fontFamily: 'SFProDisplay',
                fontSize: 12.0,
                letterSpacing: 1.0,
              ),
            ),
            SizedBox(height: 30.0),
            Text(
              'Message',
              style: TextStyle(
                color: Color(0x80252540),
                fontFamily: 'SFProDisplay',
                fontSize: 12.0,
                letterSpacing: 1.0,
              ),
            ),
            Divider(
              height: 10.0,
              color: Color(0x33252540),
            ),
            //SizedBox(height: 10.0),
            Text(
              'This is my message!',
              style: TextStyle(
                color: Color(0xFF252540),
                fontFamily: 'SFProDisplay',
                fontSize: 12.0,
                letterSpacing: 1.0,
              ),
            ),
            SizedBox(height: 10.0),
            Text(
              'Answer',
              style: TextStyle(
                color: Color(0x80252540),
                fontFamily: 'SFProDisplay',
                fontSize: 12.0,
                letterSpacing: 1.0,
              ),
            ),
            Divider(
              height: 10.0,
              color: Color(0x33252540),
            ),
            //SizedBox(height: 10.0),
            Container(
              color: Color(0xFFF8EAE2),
              padding: EdgeInsets.fromLTRB(10, 10, 190, 308),
              child: Text(
                'Type your message here...',
                style: TextStyle(
                  color: Color(0x80252540),
                  fontFamily: 'SFProDisplay',
                  fontSize: 12.0,
                  letterSpacing: 1.0,
                ),
              ),
            ),
            SizedBox(height: 30.0),
            Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                ElevatedButton(
                  onPressed: () {},
                  style: ButtonStyle(
                        padding: MaterialStateProperty.all<EdgeInsets>(EdgeInsets.all(15)),
                        backgroundColor: MaterialStateProperty.all<Color>(Color(0xFFFFFFFF)),
                        shape: MaterialStateProperty.all<RoundedRectangleBorder>(
                            RoundedRectangleBorder(
                                borderRadius: BorderRadius.circular(10.0),
                                side: BorderSide(color: Color(0xFFA3485B))
                            )
                        ),
                  ),
                  child: Text(
                    'DISCARD',
                    style: TextStyle(
                      fontSize: 12.0,
                      letterSpacing: 2.0,
                      color: Color(0xFFA3485B),
                      fontFamily: 'STHeiti',
                    ),
                  ),
                ),
                SizedBox(width: 20.0),
                ElevatedButton(
                  onPressed: () {},
                  style: ButtonStyle(
                      padding: MaterialStateProperty.all<EdgeInsets>(EdgeInsets.all(15)),
                    backgroundColor: MaterialStateProperty.all<Color>(Color(0xFFA3485B)),
                    shape: MaterialStateProperty.all<RoundedRectangleBorder>(
                      RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(10.0),
                        side: BorderSide(
                          color: Color(0xFFA3485B),
                          width: 2.0,
                        ),
                      ),
                    ),
                  ),
                  child: Text(
                    'ANSWER',
                    style: TextStyle(
                      fontSize: 12.0,
                      letterSpacing: 2.0,
                      color: Color(0xFFFFFFFF),
                      fontFamily: 'STHeiti',
                    ),
                  ),
                ),
              ],
            ),
            //SizedBox(height: 30.0),
            Column(
              mainAxisAlignment: MainAxisAlignment.end,
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Container(
                  decoration: BoxDecoration(
                      color: Color(0xFFA3485B),
                      border: Border.all(
                        color: Color(0xFFA3485B),
                      ),
                      borderRadius: BorderRadius.all(Radius.circular(30)),
                    boxShadow: [
                      BoxShadow(
                        color: Colors.black.withOpacity(0.16),
                        spreadRadius: 1,
                        blurRadius: 10,
                        offset: Offset(0, 3), // changes position of shadow
                      ),
                    ],
                  ),
                  margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                  padding: EdgeInsets.fromLTRB(19, 1, 19, 1),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                     crossAxisAlignment: CrossAxisAlignment.center,
                     children: [
                       IconButton(
                         onPressed: () {},
                         icon: Icon(
                           FontAwesome4.mail,
                           color: Color(0xFFFFFFFF),
                         ),
                       ),
                       IconButton(
                         onPressed: () {},
                         icon: Icon(
                           FontAwesome4.inbox,
                           color: Color(0xFFFFFFFF),
                         ),
                       ),
                       Container(
                           decoration: BoxDecoration(
                               color: Color(0xFFFFFFFF),
                               border: Border.all(
                                 color: Color(0xFFFFFFFF),
                               ),
                               borderRadius: BorderRadius.all(Radius.circular(20)),
                             boxShadow: [
                               BoxShadow(
                                 color: Colors.black.withOpacity(0.16),
                                 spreadRadius: 1,
                                 blurRadius: 10,
                                 offset: Offset(0, 3), // changes position of shadow
                               ),
                             ],
                           ),
                           margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                           padding: EdgeInsets.all(0),
                           child: IconButton(
                             onPressed: () {},
                             icon: Icon(
                               FontAwesome4.home,
                               color: Color(0xFFA3485B),
                             ),
                           ),
                       ),
                       IconButton(
                         onPressed: () {},
                         icon: Icon(
                           FontAwesome4.euro,
                           color: Color(0xFFFFFFFF),
                         ),
                       ),
                       IconButton(
                         onPressed: () {},
                         icon: Icon(
                           FontAwesome4.hammer,
                           color: Color(0xFFFFFFFF),
                         ),
                       ),
                     ],
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * Created on June 18, 2019, 7:18 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

int main() {
    // Player stats
    int playerHp = 100;
    int playerAtk = 1;
    int playerDef = 5;
    
    // Monster 1 stats
    int mon1Hp = 10;
    int mon1Atk = 8;
    
    // Monster 2 stats
    int mon2Hp = 50;
    int mon2Atk = 15;
    int mon2Def = 5;
    
    // Boss stats
    int bossHp = 200;
    int bossAtk = 25;
    int bossDef = 10;
    
    // 0 is start
    int checkpoint = 0;
    
    char userInput;
    string line;
    
    cout << "Would you like to play a game?\ny or n" << endl;
    cin >> userInput;
    
    if(userInput == 'n'){
        cout << "Exiting game..." << endl;
        return 0;
    }
    
    while(userInput == 'y'){
        switch(checkpoint){
            // starting point
            case 0:
                cout << "You have found a stick! + 1 ATK" << endl;
                playerAtk += 1;
                checkpoint++;
                break;
            
            // checkpoint 1
            case 1:
                cout << "You have an encountered Monster 1!" << endl;
                while(playerHp > 0 && mon1Hp > 0){
                    cout << "You attack Monster 1! You do " << playerAtk << " damage." << endl;
                    mon1Hp -= playerAtk;
                    cin >> line;
                    if(mon1Hp <= 0){
                        cout << "You have killed the Monster!" << endl;
                        cout << "You obtain:\nBroad Sword + 7 ATK\nBaseball cap + 5 DEF" << endl;
                        checkpoint++;
                        playerAtk += 7;
                        playerDef += 5;
                        cin >> line;
                        break;
                    }
                    
                    cout << "Monster 1 attacks! It does " << mon1Atk - playerDef << " damage" << endl;
                    playerHp -= (mon1Atk - playerDef);
                    cin >> line;
                    
                    if(playerHp <= 0){
                        break;
                    }
                }
                break;
            
            // checkpoint 2
            case 2:
                cout << "You have an encountered Monster 2!" << endl;
                while(playerHp > 0 && mon2Hp > 0){
                    cout << "You attack Monster 2! You do " << playerAtk - mon2Def << " damage." << endl;
                    mon2Hp -= (playerAtk - mon2Def);
                    cin >> line;
                    if(mon2Hp <= 0){
                        cout << "You have killed the Monster!" << endl;
                        cout << "You obtain:\nIron Sword + 15 ATK\nSun Shield + 10 DEF" << endl;
                        checkpoint++;
                        playerAtk += 15;
                        playerDef += 10;
                        cin >> line;
                        break;
                    }
                    
                    cout << "Monster 2 attacks! It does " << mon2Atk - playerDef << " damage" << endl;
                    playerHp -= (mon2Atk - playerDef);
                    cin >> line;
                    
                    if(playerHp <= 0){
                        break;
                    }
                }
                break;
            
            // checkpoint 3
            case 3:
                cout << "Oh no! It's the boss!" << endl;
                while(playerHp > 0 && bossHp > 0){
                    cout << "You attack the boss! You do " << playerAtk - bossDef << " damage." << endl;
                    bossHp -= (playerAtk - bossDef);
                    cin >> line;
                    if(bossHp <= 0){
                        cout << "You have killed the boss!" << endl;
                        cout << "You have saved your family!" << endl;
                        checkpoint++;
                        cin >> line;
                        break;
                    }
                    
                    cout << "The boss attacks! It does " << bossAtk - playerDef << " damage" << endl;
                    playerHp -= (bossAtk - playerDef);
                    cin >> line;
                    
                    if(playerHp <= 0){
                        break;
                    }
                }
                break;
                
            // finish line
            case 4:
                cout << "Congratulations! You've won!" << endl;
                userInput = 'n';
                break;
        }
        
        // death prompt
        if(playerHp <= 0){
            cout << "You have perished! Play again?\ny or n" << endl;
            cin >> userInput;
            
            if(userInput == 'y'){
                playerHp = 100;
            }
        }
    }
    
    cout << "Thanks for playing!" << endl;
    return 0;
    
}
import os
import json
import csv

BlockDef = "public static final Block"
ItemDef = "public static final Item"
Path = os.getcwd()

f = open(file = Path + "\\bin\\Config.json")
Config = json.load(f)
f.close
ModID = Config["modid"]


def setModID(modid):
    print("Changing ModId")
    str1 = input("Input Your ModID\n")
    os.rename(src = Path + "\\Output\\resources\\assets\\" + modid, dst = Path + "\\Output\\resources\\assets\\" + str1)
    os.rename(src = Path + "\\Output\\resources\\data\\" + modid,dst = Path + "\\Output\\resources\\data\\" + str1)
    modid = str1
    dict1 = {
        "modid" : modid
    }
    f = open(file = Path + "\\bin\\Config.json", mode = 'w')
    f = json.dumps(dict1)
    f.close()

def readBlocks():
    """
    """
    ls_blocks = []
    with open(file = Path + "\\Input\\Blocks.csv", mode = 'r') as a :
        InputBlock = csv.reader(a)
        ls_blocks = list(InputBlock)
    return ls_blocks
def readItems():
    """
    """
    ls_items = []
    with open(file = Path + "\\Input\\Items.csv", mode = 'r') as a :
        InputItem = csv.reader(a)
        ls_items = list(InputItem)
    return ls_items

def genBlockList():
    """
    Makes code in class "BlockList.java"
    """
    ls_blocks = readBlocks()
    BlockList = open(file = Path + "\\Output\\BlockList.txt", mode = 'a')
    AddIn = ''
    for row in ls_blocks :
        if row[0][0] == '+':
            AddIn = ''
            for x in row[0][0]:
                if x == '+':
                    continue
                AddIn += x 
            continue
        if row[0][0] == '#':
            continue
        BlockList.write(BlockDef + ' ' + row[0] + AddIn + ';' + '\n')
    BlockList.close()
def genItemList():
    """
    Makes code in class "ItemList.java"
    """
    ls_items = readItems()
    ItemList = open(file = Path + "\\Output\\ItemList.txt", mode = 'a')
    AddIn = ''
    for row in ls_items :
        if row[0][0] == '+':
            AddIn = ''
            for x in row[0][0]:
                if x == '+':
                    continue
                AddIn += x 
            continue
        if row[0][0] == '#':
            continue
        ItemList.write(ItemDef + ' ' + row[0] + AddIn + ';' + '\n')
    ItemList.close()

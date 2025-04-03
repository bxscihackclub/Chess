from typing import NamedTuple

class Ply(NamedTuple):
    """A simple named tuple to define Ply's.
    A MOVE in chess is technically both players taking their turns.
    A PLY is a half move, either white or black taking their turn.
    """
    piece_type: int #for now
    startPos: int
    endPos: int
    # More stuff for later (ie capturing)
    
class Board:
    """We use a 64 length array to store values. 
    To convert between position and rank and file we use the following:
    - pos/8 -> rank
    - pos%8 -> file"""
    def __init__(self):
        self.board = [0]*64 # 64 length array